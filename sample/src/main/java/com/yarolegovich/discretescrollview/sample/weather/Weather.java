package com.yarolegovich.discretescrollview.sample.weather;

/**
 * Created by yarolegovich on 08.03.2017.
 */

public enum Weather {

    PERIODIC_CLOUDS(""),
    CLOUDY("Cloudy"),
    PARTLY_CLOUDY("World Engineering Education Forum (WEEF), held in Singapore in October 2010, was the brainchild of leaders in the global engineering education community who sought to bring together the world's engineering education societies to the same place at one time, allowing for logistical and programmatic synergies. Since 2010, the WEEF has been held in Buenos Aires, Argentina (2012), Cartagena de Indias, Colombia (2013), Dubai, United Arab Emirates (2014), Florence, Italy (2015), Seoul, Korea (2016), Kuala Lumpur, Malaysia (2017) and Albuquerque, New Mexico, USA (2018).<br><br>WEEF has been an important event in furthering IFEES' mission to bring together the global community to build excellence in engineering education. Not only do international organizations benefit greatly from the Forum, but local engineering education institutions are heavily involved in the vision and execution of this event. The venue of WEEF changes each year, and the event has brought great visibility to local institutions which otherwise may not have had such opportunities to interact and cooperate with foreign and international engineering education organizations.<br><br>WEEF has served as an opportunity for IFEES members to gather in one place, discuss leading issues in engineering education, and to share and learn best practices."),
    VERY_SUNNY("Dear Participants,<br>" +
            "It is our pleasure to invite you to participate in the World Engineering Education Forum (WEEF) and the International Engineering Student Summit (IESS), to be held in Chennai, India, from 13-16 November, 2019." +
            "<br>" +
            "These annual events are gaining importance in the world of engineering and the global engineering community. These events are a platform for leading experts to gather, update, brainstorm, share information and speak on issues pertaining to engineering and technology, in general and current day engineering education, in particular. Attended by educators and top representatives from various engineering and technology sectors, these events have, over the years, provided an international arena for the exchange and dissemination of information about the latest developments in the domain of engineering education from around the globe." +
            "<br>" +
            "The theme for WEEF 2019 is Disruptive Engineering Education for Sustainable Development with sub-themes focusing on: disruptions in Student-centered Learning; disruptions in the process of Engineering Education; disruptions in Institute-Industry Interaction; disruptive Technologies; socio-economic development through disruption." +
            "<br>" +
            "We are privileged to host WEEF2019 in Chennai, India. India is a major education player in South Asia – with an active, matured and scholarly team of academics who are passionate and committed educators and promoters of change in engineering education, to meet 21st century needs." +
            "<br>" +
            "We hope you will not miss this opportunity to be part of this and join us in recognizing and sharing the best in engineering education practices.\n" +
            "<br>" +
            "We are looking forward to hosting all our delegates in 2019." +
            "<br>" +
            "Sincerely,<br>" +
            "<b>Dr. R. Jagadeesh Kannan</b><br>" +
            "Dean, School of Computing Science & Engineering<br>" +
            "Vellore Institute of Technology Chennai campus"),
    MOSTLY_CLOUDY("On November 13th through 16th, 2019, Chennai,India will be the host city of WEEF-IESS 2019, the joint annual summit of the International Federation of Engineering Education Societies.<br><br> This prestigious event, held for the first time in India, features the IX World Engineering Education Forum (WEEF) and the International Engineering Student Summit. This is the largest engineering education gathering in the world and brings together a large number of stakeholders, including engineering educators, leaders, students, industry, governmental organizations, non-governmental organizations, etc., to learn, share, and build fruitful and long-term collaborations. The conference theme is Disruptive Engineering Education for sustainable development.<br><br>Vellore Institute of Technology, Chennai, will host the combined WEEF-IESS."),
    CLEAR("<b><big>Why you should attend?</big></b><br>WEEF brings together the world's engineering education societies, and provides an excellent platform for information sharing, discussion and updates on global developments.<br>The Forum attracts up to 1,000 delegates, which include international educators and top representatives from the various related engineering and corporate sectors. Indian institutions and organisations will garner positive exposure by participating in the event - an opportunity for international visibility and active interaction with a global audience.<br>The theme of the 2019 Forum encourages greater collaboration between the various parties, to accomplish satisfactory outcomes from an integrated and organised engineering ecosystem.<br>India is an active participant in the region, sharing its initiatives and promoting a national policy of an inter-disciplinary approach to learning via STEM (Science, Technology, Engineering, Mathematics) education. A White Paper will be written by EPSI, based on outcomes from the Forum's special sessions, and will encompass important resolutions and policy recommendations to influence the future direction of an engineering education.<br>WEEF 2019 can be considered a \"national effort\" in gaining a \"voice\" in the region, providing both the context, form, content and opportunity in sharing the best in engineering education practices and the latest developments in the global engineering \"community\".<br><br>Download the conference schedule here :- <br>https://www.weef2019.org/images/Conference%20Programme25th%20July.pdf"),
    SUNNY("");

    private String displayName;

    Weather(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
