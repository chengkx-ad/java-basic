package test1;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;
    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};
    // attack 攻击描述:
    String[] attacks_desc={
            "%s 使出了一招【背心钉]，转到对方的身后，一掌向%s背心的灵台穴拍去。","%s 使出了一招【游空探爪]，飞起身形自半空中变掌为抓锁向%s。","%s 大喝一声，身形下伏，一招【劈雷坠地]，捶向%s双腿。","%s 运气于掌，一瞬间掌心变得血红，一式【掌心雷]，推向%s。","%s阴手翻起阳手跟进，一招【没遮拦]，结结实实的捶向%s。","%s 上步抢身，招中套招，一招[劈挂连环]，连环攻向%s。"};
    // injured 受伤描述;
    String[] injureds_desc={"结果%s 退了半步，毫发无损","结果给%s造成一处瘀伤",
        "结果一击命中，%s痛得弯下腰",
        "结果%s 痛苦地闷哼了一声，显然受了点内伤","结果%s摇摇晃晃，一跤摔倒在地",
        "结果%s脸色一下变得惨白，连退了好几步","结果「轰」的一声，%s口中鲜血狂喷而出","结果%S一声惨叫，像滩软泥般塌了下去"};



    public Role() {
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     *
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    // 定义攻击
    public void attack(Role role) {
        Random x = new Random();
        int index = x.nextInt(attacks_desc.length);
        // 输出一个攻击效果
        System.out.printf(attacks_desc[index], this.getName(), role.getName());
        System.out.println();



        // 伤害
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        int RaminBlood = role.getBlood() - hurt;
        RaminBlood = RaminBlood < 0 ? 0 : RaminBlood;
        role.setBlood(RaminBlood);

        // 受伤描述
        /*
        * 如果血量 > 90 , 索引0
        * 80 - 90 ， 索引1
        * 70 - 80 ， 索引2
        * 60 - 70 ， 索引3
        * 40 - 60 ， 索引4
        * 20 - 40 ， 索引5
        * 10 - 20 ， 索引6
        * 小于10 ， 索引7
        * */
        if (RaminBlood > 90){
            System.out.printf(injureds_desc[0], role.getName());
        } else if (RaminBlood > 80 && RaminBlood <= 90) {
            System.out.printf(injureds_desc[1], role.getName());
        }else if (RaminBlood > 70 && RaminBlood <= 80) {
            System.out.printf(injureds_desc[2], role.getName());
        }else if (RaminBlood > 60 && RaminBlood <= 70) {
            System.out.printf(injureds_desc[3], role.getName());
        }else if (RaminBlood > 40 && RaminBlood <= 60) {
            System.out.printf(injureds_desc[4], role.getName());
        }else if (RaminBlood > 20 && RaminBlood <= 40) {
            System.out.printf(injureds_desc[5], role.getName());
        }else if (RaminBlood > 10 && RaminBlood <= 20) {
            System.out.printf(injureds_desc[6], role.getName());
        }else{
            System.out.printf(injureds_desc[7], role.getName());
        }
        System.out.println();
    }

    /**
     * 获取
     *
     * @return gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * 设置
     *
     * @param gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * 获取
     *
     * @return face
     */
    public String getFace() {
        return face;
    }
    /**
     * 设置
     *
     */
    public void setFace(char gender) {
        Random r = new Random();
        // 随机长相
        if (gender == '男') {
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        } else if (gender == '女') {
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        } else {
            this.face = "面目狰狞";
        }
    }


    public void ShowRoleInFor() {
        System.out.println("姓名为" + getName());
        System.out.println("性别为" + getGender());
        System.out.println("长相为" + getFace());
        System.out.println("血量为" + getBlood());

    }
}
