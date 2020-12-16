package com.myspace.getting_started;

import org.kie.api.event.rule.*;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

public class CustomAgendaEventListener implements AgendaEventListener {

//    private static final Logger logger = LoggerFactory.getLogger(CustomAgendaEventListener.class);

    public void matchCreated(MatchCreatedEvent event) {
        System.out.println("The rule "
                + event.getMatch().getRule().getName()
                + " matchCreated");
    }

    public void matchCancelled(MatchCancelledEvent event) {
        System.out.println("The rule "
                + event.getMatch().getRule().getName()
                + " matchCancelled");
    }

    public void beforeMatchFired(BeforeMatchFiredEvent event) {
        System.out.println("The rule "
                + event.getMatch().getRule().getName()
                + " beforeMatchFired");
    }

    public void afterMatchFired(AfterMatchFiredEvent event) {
        System.out.println("The rule "
                + event.getMatch().getRule().getName()
                + " afterMatchFired");
    }

    public void agendaGroupPopped(AgendaGroupPoppedEvent event) {
        System.out.println("The rule "
                + event.getAgendaGroup().getName()
                + " agendaGroupPopped");

    }

    public void agendaGroupPushed(AgendaGroupPushedEvent event) {
        System.out.println("The rule "
                + event.getAgendaGroup().getName()
                + " agendaGroupPushed");
    }

    public void beforeRuleFlowGroupActivated(RuleFlowGroupActivatedEvent event) {
        System.out.println("The rule "
                + event.getRuleFlowGroup().getName()
                + " beforeRuleFlowGroupActivated");
    }

    public void afterRuleFlowGroupActivated(RuleFlowGroupActivatedEvent event) {
        System.out.println("The rule "
                + event.getRuleFlowGroup().getName()
                + " afterRuleFlowGroupActivated");
    }

    public void beforeRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent event) {
        System.out.println("The rule "
                + event.getRuleFlowGroup().getName()
                + " beforeRuleFlowGroupDeactivated");
    }

    public void afterRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent event) {
        System.out.println("The rule "
                + event.getRuleFlowGroup().getName()
                + " afterRuleFlowGroupDeactivated");
    }
}