package bank;

public class Member {
    String memberName, memberMobileNo;
    public void setName(String name){
        memberName = name;
    }
    public String getName(){
        return memberName;
    }
    public void setMemberMobileNo(String MobileNo){
        memberMobileNo = MobileNo;
    }
    public String getMemberMobileNo(){
        return memberMobileNo;
    }
}
