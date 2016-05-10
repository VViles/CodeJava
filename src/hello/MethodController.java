package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MethodController {
    
    @RequestMapping("/hello")
    public @ResponseBody String test() {
        return "hello, world! This com from spring!";
    }
    //��ͨ��url·��ӳ��
    @RequestMapping(value={"/multi1","/multi2","/test/multi"})
    public @ResponseBody String multiUrl() {
        return "test multi url";
    }
    //������URLģ��ӳ��
    @RequestMapping(value="/user1/{name}")
    public @ResponseBody String basicUrl1(@PathVariable String name){
    	return "hello"+name;
    }
    @RequestMapping(value="/user2/{name}/test")
    public @ResponseBody String basicUrl2(@PathVariable String name){
    	return "hello"+name+"test";
    }
    @RequestMapping(value="/user1/{name}/test/{age}")
    public @ResponseBody String basicUrl3(@PathVariable String name,@PathVariable int age){
    	return "hello"+name+" age"+age;
    }
    
    //Ant���URLӳ��
    @RequestMapping(value="/ant/**")
    public @ResponseBody String basicAnt(){
    	return "basicAnt";
    }
    @RequestMapping(value="/ant1?")
    public @ResponseBody String ant1(){
    	return "ant1?";
    }
    @RequestMapping(value="/ant2*")
    public @ResponseBody String ant2(){
    	return "ant2*";
    }
    @RequestMapping(value="/ant3/*")
    public @ResponseBody String ant3(){
    	return "ant3/*";
    }
    @RequestMapping(value="/ant4/**")
    public @ResponseBody String ant4(){
    	return "ant4/**";
    }
    
    //����
    @RequestMapping(value="/ant5/**/{name}")
    public @ResponseBody String ant5(@PathVariable String name){
    	return "ant+url  "+name;
    }
    
    //������ʽ
    @RequestMapping(value="/student/{name:\\w+}-{age:\\d+}")
    public @ResponseBody String regUrl(@PathVariable String name,@PathVariable int age){
    	return "name:"+name+" age:"+age;
    }
}