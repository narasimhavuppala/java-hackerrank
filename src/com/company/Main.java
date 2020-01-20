package com.company;


import com.company.hash.DemoHash;
import com.company.lottery.LotteryAlgorithm;
import com.company.queue.DemoQueue;
import com.company.stack.DemoStack;
import com.company.tree.DemoBinaryTree;

public class Main {

    public static void main(String[] args) {
//        DemoStack demoStack = new DemoStack();
//        demoStack.run();

//        DemoQueue demoQueue = new DemoQueue();
//        demoQueue.run();

//        DemoHash demoHash = new DemoHash();
//        demoHash.changeOil();

//        DemoBinaryTree app = new DemoBinaryTree();
//        app.loadContacts();

        //See if we have any of the following contacts
//        app.searchContacts();

        //delete some contacts
//        app.cleanupContacts();

        LotteryAlgorithm lotteryAlgorithm = new LotteryAlgorithm();
        lotteryAlgorithm.generateListOfNumbers(1);
    }


}
