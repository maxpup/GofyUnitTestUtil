package com.github.maxpup.gofyunittestutil.services

import com.intellij.openapi.project.Project
import com.github.maxpup.gofyunittestutil.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
