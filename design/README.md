# Sage Architecture

Sage is implementation of Saga pattern, consisting of 2 components:

- Sage Orchestrator
  
- Sage Pod

![Sage Architecture](SageArchitecture.png)

### Sage Orchestrator 

  + Manage orchestration
  + Execute orchestration
  + Handle response from Sage Pod
  + Support fault tolerant, timeout handling

### Sage Pod

  + Receive orchestration events
  + Receive success/compensating events
  + Support idempotent, timeout handling, late events...
