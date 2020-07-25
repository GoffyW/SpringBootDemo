package com.example.demo.utils;

/**
 * @author GoffyGUO
 */
public class MessageTask {
    private String taskId;
    private String content;
    private String messageId;
    private String taskName;

    private MessageTask(Builder builder){
        this.taskId=builder.taskId;
        this.content=builder.content;
        this.messageId=builder.messageId;
        this.taskName=builder.taskName;
    }

    /**
     * 创建内部类
     */
    public static class Builder{
        private String taskId;
        private String content;
        private String messageId;
        private String taskName;

        public Builder setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Builder setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        public Builder setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public MessageTask build(){
            return new MessageTask(this);
        }
    }





}
