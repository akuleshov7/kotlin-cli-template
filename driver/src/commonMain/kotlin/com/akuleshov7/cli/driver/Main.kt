/**
 * Main entry point for CLI
 */

package com.akuleshov7.cli.driver

import com.akuleshov7.cli.common.config.CliProperties
import com.akuleshov7.cli.common.config.VERSION
import com.akuleshov7.cli.common.logging.logInfo
import com.akuleshov7.cli.driver.config.of

const val APP_NAME = "kotlin-mpp-cli"
fun main(args: Array<String>) {
    // Version is an autogenerated code, please make './gradlew build' first
    logInfo("Welcome to $APP_NAME version $VERSION")
    val config = CliProperties.of(args)
}
