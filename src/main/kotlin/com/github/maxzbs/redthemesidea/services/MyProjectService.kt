package com.github.maxzbs.redthemesidea.services

import com.intellij.openapi.project.Project
import com.github.maxzbs.redthemesidea.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))

        System.getenv("CI")
            ?: TODO("Don't forget to remove all non-needed sample code files with their corresponding registration entries in `plugin.xml`.")
    }
}
