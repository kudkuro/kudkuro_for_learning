public class HelloSpringAI {
    public static void main(String[] args) {
        System.out.println("欢迎来到编程导航的 Spring AI 教程！");
        
        // 显示一些基本的系统信息
        System.out.println("Java 版本: " + System.getProperty("java.version"));
        System.out.println("Java 安装路径: " + System.getProperty("java.home"));
        System.out.println("操作系统: " + System.getProperty("os.name") + " " + 
        System.getProperty("os.version"));
        
        // 计算并显示一个简单的 AI 相关例子
        int trainingData = 1000000;
        int modelParameters = 100000000;
        double accuracy = 0.975;
        
        System.out.println("\n模拟 AI 模型信息:");
        System.out.println("训练数据量: " + trainingData + " 样本");
        System.out.println("模型参数量: " + modelParameters);
        System.out.println("模型准确率: " + (accuracy * 100) + "%");
        
        System.out.println("\n准备好开始 Spring AI 之旅了吗？");
    }
}
