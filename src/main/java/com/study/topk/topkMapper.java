package com.study.topk;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class topkMapper extends Mapper<IntWritable,Text,Text,IntWritable>{
    @Override
    protected void map(IntWritable key, Text value, Context context) throws IOException, InterruptedException {
        String line = value.toString().toLowerCase();
    }
}
