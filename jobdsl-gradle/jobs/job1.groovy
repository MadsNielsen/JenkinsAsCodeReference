/**
 * Created by asa on 21/03/16.
 */
import job.JobsHelper
import javaposse.jobdsl.dsl.DslFactory
import javaposse.jobdsl.dsl.Job

Job job1 = JobsHelper.createJob(this as DslFactory, "JenkinsCI")
JobsHelper.addDescriptionParam(job1)
JobsHelper.addStep(job1, "echo 'Hello!'")
JobsHelper.addScmBlock(job1, "git@team.git", "master", "user1")
JobsHelper.addPretestedIntegration(job1)