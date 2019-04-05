package com.gtu.servicelafusion.controllers;



import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;


import java.io.BufferedOutputStream;


import java.io.*;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class ImageController {


    @PostMapping("image")
    public String image(MultipartHttpServletRequest req) {
        String filepath = "";
        String fileName = "";
        SimpleDateFormat dt = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");

        Map<String, Object> mresponse = new HashMap<>();
        try {
            MultipartHttpServletRequest mRequest = (MultipartHttpServletRequest) req;
            mRequest.getParameterMap();
            Iterator itr = mRequest.getFileNames();
            while (itr.hasNext()) {
                MultipartFile mFile = mRequest.getFile((String) itr.next());
                fileName = mFile.getOriginalFilename();
                System.out.println(fileName);

                mresponse.put("path", String.valueOf(req.getServletContext().getRealPath("/")));

                try {
                    /*if (!new File(String.valueOf(req.getServletContext().getRealPath("/")) + "static//resources//images//employee//preTest//speakingPretest//").exists()) {
                        // mresponse.put("is_created", new File(String.valueOf(req.getServletContext().getRealPath("/")) + "WEB-INF//classes//static//resources//images//employee//preTest//speakingPretest").mkdir());
                        mresponse.put("is_created", new File(String.valueOf(req.getServletContext().getRealPath("/")) + "static//resources//images//employee//preTest//speakingPretest").mkdir());
                        System.out.println(String.valueOf(req.getServletContext().getRealPath("/")));
                    }
                    */
                    filepath = dt.format(new Date()) + ".jpg";
                    BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(String.valueOf("D://" +  fileName))));
                    FileCopyUtils.copy((InputStream) mFile.getInputStream(), (OutputStream) stream);
                    System.out.println(String.valueOf(req.getServletContext().getRealPath("/")));
                    mresponse.put("filepath", new File(getClass().getResource("/static/resources/images/employee").getFile()).getPath());
                    stream.close();
                    continue;
                } catch (Exception e) {
                    e.printStackTrace();
                    mresponse.put("error", e.getMessage());
                }
            }
        }catch (Exception e) {
            System.out.println("error...");
        }

        return "okk";
    }

}
