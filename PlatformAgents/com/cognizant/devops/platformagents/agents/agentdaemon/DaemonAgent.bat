pushd %INSIGHTS_AGENT_HOME%\AgentDaemon
python -c "from com.cognizant.devops.platformagents.agents.agentdaemon.AgentDaemonExecutor import AgentDaemonExecutor; AgentDaemonExecutor()"