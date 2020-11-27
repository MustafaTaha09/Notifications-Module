package com.company;

import java.util.*;

public interface TemplateManager {
    public boolean addTemplate(NotificationTemplate template);

    public boolean deleteTemplate(String subject);

    public boolean updateTemplate(String subject, NotificationTemplate updatedTemplate);

    public NotificationTemplate getTemplate(String subject);

    public ArrayList<NotificationTemplate> getAllTemplates();
}
