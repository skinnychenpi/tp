---
layout: page
title: Chen Yuheng's Project Portfolio Page
---

## Project: MeetBuddy

MeetBuddy is your handy desktop app, optimized for NUS students to manage their social connections and daily tasks who prefer to work with a Command Line Interface (CLI) while still having the benefits of a Graphical User Interface (GUI)! I have added the functionality for tasks scheduling and the connections between tasks and contacts! The GUI of MeetBuddy was created with JavaFX and written in Java, and I have written about 5 kLoC.

Given below are my contributions to the project.

* **New Feature**: Added the Meeting Class for tasks (i.e. meetings) scheduling.
    * What it does: allows the user to create a meeting object with various attributes and add them into the GUI.
    * Justification: This feature is an important part in our program.
    * Highlights: This feature affects existing commands and commands to be added in the future. It required an in-depth analysis of design alternatives. The implementation too was challenging as it required to add commands, parsers, models, GUI.

* **New Feature**: Added the PersonMeetingConnection Class for the interactions between contacts and meetings.
    * What it does: allows the user build a connection between the meetings and the contacts. For example, specify the people related to a certain meeting.
    * Highlights: The implementation of the class requires careful design and numerous modification on existing codes as it relates to both contacts and meetings. It's also the very key function in our program, as it brings connections to two major parts in the model.
* **Code contributed**: [RepoSense link](https://nus-cs2103-ay2021s2.github.io/tp-dashboard/?search=T16-2&sort=groupTitle&sortWithin=title&timeframe=commit&mergegroup=&groupSelect=groupByRepos&breakdown=true&checkedFileTypes=docs~functional-code~test-code~other&since=2021-02-19&tabOpen=true&tabType=authorship&tabAuthor=skinnychenpi&tabRepo=AY2021S2-CS2103-T16-2%2Ftp%5Bmaster%5D&authorshipIsMergeGroup=false&authorshipFileTypes=docs~functional-code~test-code~other&authorshipIsBinaryFileTypeChecked=false)

* **Project management**:
    * Maintained the backend, especially the model and logic part of MeetBuddy.

* **Enhancements to existing features**:
    * Created the meeting in MeetBuddy model, which is one of two major parts in MeetBuddy. (Pull requests [\#42](https://github.com/AY2021S2-CS2103-T16-2/tp/pull/42))
    * Created the AddMeetingCommand and AddMeetingParser in MeetBuddy and also modifies the GUI. (Pull requests [\#52](https://github.com/AY2021S2-CS2103-T16-2/tp/pull/52))
    * Created Person Meeting Connection APIs for model development, which allows user to interact with both contacts management and meeting management together (Pull requests [\#70](https://github.com/AY2021S2-CS2103-T16-2/tp/pull/70), [\#73](https://github.com/AY2021S2-CS2103-T16-2/tp/pull/73))
    * Add AddPersonToMeetingConnectionCommand and DeletePersonToMeetingConnectionCommand into MeetBuddy so that the user can add and delete the persons related to a meeting. (Pull requests [\#103](https://github.com/AY2021S2-CS2103-T16-2/tp/pull/103))

* **Documentation**:
    * Updated User Guide and Developer Guide for Person Meeting Connection and relevant Meeting features, including adding relevant PlantUML diagrams in the Developer Guide to enhance comprehensibility of the codebase and the structure of the feature. (Pull requests [\#186](https://github.com/AY2021S2-CS2103-T16-2/tp/pull/186) [\#200](https://github.com/AY2021S2-CS2103-T16-2/tp/pull/200))

* **Community**:
    * PRs reviewed (with non-trivial review comments): [\#193](https://github.com/AY2021S2-CS2103-T16-2/tp/pull/193), [\#197](https://github.com/AY2021S2-CS2103-T16-2/tp/pull/197), [\#188](https://github.com/AY2021S2-CS2103-T16-2/tp/pull/188)
  
* **Summary of Contributions**:
    * Created about 25 PRs on the team repo. [\#Link](https://github.com/AY2021S2-CS2103-T16-2/tp/pulls?q=is%3Apr+author%3Askinnychenpi)