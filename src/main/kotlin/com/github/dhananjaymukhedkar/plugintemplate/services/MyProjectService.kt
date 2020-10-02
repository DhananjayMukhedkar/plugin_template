package com.github.dhananjaymukhedkar.plugintemplate.services

import com.intellij.openapi.project.Project
import com.github.dhananjaymukhedkar.plugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
