package com.roopa.learning.core.dailyassignments;

public class EncapsulationVoterprgm {
    public static void main(String[] args) {
        Voter voter = new Voter();

        voter.setName("Roopa");
        voter.setAge(16);
        voter.setHasVoted(false);

        System.out.println(voter);

        Voter voter1 = new Voter();

        voter1.setName("Raj");
        voter1.setHasVoted(true);
        voter1.setAge(20);


        System.out.println(voter1);
    }

}

class Voter{

    private  String name;
    private  int  age;
    private boolean hasVoted;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 18 ){
            System.out.println( name + " Is  Not Eligible for Voting ");
        } else if(hasVoted) {
            hasVoted  = true;
            System.out.println( name + " has already voted before");
        }else {
            hasVoted = false;
            System.out.println( name + " has successfully voted");
        }
        this.age = age;
    }

    public boolean isHasVoted() {
        return hasVoted;
    }

    public void setHasVoted(boolean hasVoted) {
        this.hasVoted = hasVoted;
    }

    @Override
    public String toString() {
        return "Voter{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hasVoted=" + hasVoted +
                '}';
    }
}

